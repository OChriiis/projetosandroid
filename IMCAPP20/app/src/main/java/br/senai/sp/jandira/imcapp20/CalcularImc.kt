package br.senai.sp.jandira.imcapp20

fun calcularImc(peso: Double, altura: Double) = peso / (altura * altura)

fun obterStatus(imc: Double) : String{
    if (imc < 18.5){
        return "Abaixo do Peso!"
    }else if (imc > 18.5 && imc < 25){
        return "Peso Ideal!"
    }else if (imc >=25 && imc < 30){
        return "Acima do Peso!"
    }else if (imc >= 30 && imc < 35){
        return "Obesidade!"
    }else if (imc >= 35 && imc < 40){
        return "Obsediade Grau II"
    }else {
        return "Obesidade Grau III"
    }
}