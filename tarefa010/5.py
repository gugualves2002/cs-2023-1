salario_minimo = 1045.00
salario_usuario = float(input("Digite o valor do salário do usuário: "))

quantidade_salarios = salario_usuario / salario_minimo

print("O usuário ganha {:.2f} salários mínimos.".format(quantidade_salarios))
