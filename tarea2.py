import math
inicio=int(input("de "))
fin=int(input("a "))
cant=inicio
raiz=0

for cant in range(inicio, fin+1):
    if int(math.sqrt(cant))**2==cant:
        raiz=raiz+1


print(raiz)
