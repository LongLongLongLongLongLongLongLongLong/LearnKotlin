/**
 * @date 2020-12-17
 * 接口是事物的能力
 */
class Man :Human(),IMan{
    override fun xiao() {
        println("哈哈")
    }

    override fun eat() {
        println("吃饭")
    }
}