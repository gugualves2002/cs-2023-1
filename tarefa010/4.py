ipi = float(input("Digite a porcentagem do IPI a ser acrescido: "))
codigo_peca1 = input("Digite o código da peça 1: ")
valor_peca1 = float(input("Digite o valor unitário da peça 1: "))
quantidade_peca1 = int(input("Digite a quantidade de peças 1: "))
codigo_peca2 = input("Digite o código da peça 2: ")
valor_peca2 = float(input("Digite o valor unitário da peça 2: "))
quantidade_peca2 = int(input("Digite a quantidade de peças 2: "))

valor_total = (valor_peca1 * quantidade_peca1 + valor_peca2 * quantidade_peca2) * (ipi / 100 + 1)

print("O valor total a ser pago é:", valor_total)
