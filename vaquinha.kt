import java.util.Scanner

fun vaquinha(conta:Float, pessoas:Int):Float{

    return conta/pessoas;
}
fun main(){
    val teclado = Scanner(System.`in`)

    print("Digite o valor da conta:\t")

    var conta: Float = teclado.nextFloat()

    print("Digite a quantidades de pessoas.\t");

    var pessoas: Int= teclado.nextInt()

    println("cada pessoa :" + vaquinha(conta,pessoas) + " " + "R$");
    
}
