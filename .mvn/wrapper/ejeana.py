# Clase base para los colores
class Color:
    def aplicar_color(self):
        print("Color genérico aplicado") 

# Implementaciones concretas de Color
class Rojo(Color):
    def aplicar_color(self):
        print("Aplicando color rojo")

class Azul(Color):
    def aplicar_color(self):
        print("Aplicando color azul")

# Clase base para las formas
class Forma:
    def _init_(self, color):
        self.color = color

    def dibujar(self):
        print("Dibujando forma genérica")
        self.color.aplicar_color()

# Formas concretas
class Circulo(Forma):
    def dibujar(self):
        print("Dibujando círculo. ", end="")
        self.color.aplicar_color()

class Cuadrado(Forma):
    def dibujar(self):
        print("Dibujando cuadrado. ", end="")
        self.color.aplicar_color()

# Uso
if _name_ == "_main_":
    circulo_rojo = Circulo(Rojo())
    cuadrado_azul = Cuadrado(Azul())
    
    circulo_rojo.dibujar()
    cuadrado_azul.dibujar()