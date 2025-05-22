// auth.js - Funciones comunes de autenticación

function checkAuth() {
    const token = localStorage.getItem('jwtToken');
    const userData = JSON.parse(localStorage.getItem('userData'));
    
    if (!token || !userData) {
        window.location.href = 'index.html';
        return null;
    }
    
    return userData;
}

async function makeAuthenticatedRequest(url, method = 'GET', body = null) {
    const token = localStorage.getItem('jwtToken');
    
    try {
        const options = {
            method,
            headers: {
                'Content-Type': 'application/json',
                'Authorization': `Bearer ${token}`
            }
        };
        
        if (body) {
            options.body = JSON.stringify(body);
        }
        
        const response = await fetch(url, options);
        
        if (response.status === 401) {
            // Token inválido o expirado
            logout();
            return null;
        }
        
        return await response.json();
    } catch (error) {
        console.error('Error:', error);
        alert('Error al conectar con el servidor');
        return null;
    }
}

function logout() {
    localStorage.removeItem('jwtToken');
    localStorage.removeItem('userData');
    window.location.href = 'index.html';
}

// Ejemplo de cómo usar makeAuthenticatedRequest:
// async function loadPacientes() {
//     const data = await makeAuthenticatedRequest('http://localhost:8080/api/pacientes');
//     if (data) {
//         // Procesar los datos
//     }
// }