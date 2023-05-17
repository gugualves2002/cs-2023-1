def calcular_idade_em_dias(anos, meses, dias):
    dias_totais = anos * 365 + meses * 30 + dias
    return dias_totais

anos = int(input("Digite a quantidade de anos: "))
meses = int(input("Digite a quantidade de meses: "))
dias = int(input("Digite a quantidade de dias: "))
idade_em_dias = calcular_idade_em_dias(anos, meses, dias)
print(f"A idade em dias é: {idade_em_dias} dias.")