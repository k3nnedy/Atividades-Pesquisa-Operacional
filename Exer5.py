def somarMatrizes(matriz, matriz2):
    if(len(matriz) != len(matriz2) or len(matriz[0]) != len(matriz2[0])):
        return None
    resultado = []
    for i in range(len(matriz)):   
        resultado.append([])
        for j in range(len(matriz[0])):
            soma = int(matriz[i][j]) + int(matriz2[i][j])
            resultado[i].append(soma)
    return resultado

arq = open('arquivo.txt', 'r')  
texto = []  
matriz = [] 
matriz2 = []
texto = arq.readlines() 

for i in range(len(texto)):        
    if(i < 10):
        matriz.append(texto[i].split())
    else:
        if(texto[i] != '\n'):
            matriz2.append(texto[i].split())
        
soma = somarMatrizes(matriz, matriz2) 
print('==================================================')
print("Resultado da soma")
if soma is not None:
    for i in soma:
        print(i)
else:
    print('número colunas ou Linhas diferentes')
arq.close()