def calcular_reajuste(saldo):
    reajuste = saldo * 0.15
    saldo_reajustado = saldo + reajuste
    return saldo_reajustado

saldo = float(input("Digite o valor do saldo: "))
saldo_reajustado = calcular_reajuste(saldo)
print(f"O saldo com reajuste de 15% é: {saldo_reajustado}")