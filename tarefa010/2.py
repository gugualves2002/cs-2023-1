def calcular_media(numeros):
    soma = sum(numeros)
    media = soma / len(numeros)
    return media

numeros1 = [8, 9, 7]
media1 = calcular_media(numeros1)
print("Média dos números 8, 9 e 7:", media1)

numeros2 = [4, 5, 6]
media2 = calcular_media(numeros2)
print("Média dos números 4, 5 e 6:", media2)

soma_medias = media1 + media2
print("Soma das médias:", soma_medias)

medias = [media1, media2]
media_das_medias = calcular_media(medias)
print("Média das médias:", media_das_medias)