numeros = []

for i in range(0, 10):
    numeros.append(int(input(f'Digite {i+1}º numero: ')))

maior = (max(int(numero) for numero in numeros))  
menor = (min(int(numero) for numero in numeros))  
media = (sum(int(numero) for numero in numeros) / 10)  

print('======================================================')
print(f'O maior número é: {maior}, o menor é {menor} e a média é {media}')