import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
 * 以下为自己定义的函数
 * (String> -> Unit 函数类型  参数为字符串  返回值是Unit
 */

/*
示例1
 var print = fun  (name:String):Unit{
    println(name)
}

fun main(args:Array<String>) {

    var names = listOf<String>("tom","jerry","lucy")

    //1.forEach函数接收的是一个函数
    //forEach函数的定义如下
    */
/**
    @kotlin.internal.HidesMembers
    public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
    }
     *//*

    //2. action 的作用是将每一个值传到函数中
    names.forEach(print) //print是一个函数
}*/


/*示例2
fun main(args:Array<String>) {

    var names = listOf<String>("tom","jerry","lucy")

    //1.forEach函数接收的是一个函数
    //2. 可以在forEach后面直接写一个{} 括号中定义匿名函数

    names.forEach{
        a -> println(a)
    }
}*/

/*//示例3
fun main(args:Array<String>) {

    var names = listOf<String>("tom","jerry","lucy")
    //1.forEach函数接收的是一个函数
    //2. 可以在forEach后面直接写一个{} 括号中定义匿名函数
    names.forEach{
        //forEach函数中默认有一个参数 it  可以直接使用
        println(it)
    }
}*/

/*fun main(args:Array<String>) {

    //在内存中创建宽高为100的图片
    var image = BufferedImage(100,100,BufferedImage.TYPE_INT_RGB)
    var w = 0.. 99; //图片的宽
    var h = 0.. 99;  //图片的高

    image.apply {

        for(i in w){
            for(j in h){
                setRGB(i,j,0xff0000)
            }
        }
    }

    //图片保存到文件中
    ImageIO.write(image,"bmp", File("a.bmp"))
}*/


fun main(args:Array<String>) {


}















































