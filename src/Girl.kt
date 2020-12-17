/**
 */
data class Girl(var name:String,var age:Int, var height:Int, var address:String)

//模拟选手信息
  var 选手数据库 = listOf<Girl>(
    Girl("选手1",18,167,"山东"),
    Girl("选手2",19,167,"广东"),
    Girl("选手3",16,166,"湖南"),
    Girl("选手4",17,167,"浙江"),
    Girl("选手5",17,165,"四川"),
    Girl("选手6",19,167,"山西"),
    Girl("选手7",18,167,"陕西"),
    Girl("选手8",15,165,"西藏"),
    Girl("选手9",19,167,"河北"),
    Girl("选手10",18,169,"甘肃")
)

//扩展的方法
fun List<Girl>.查找年龄小于17的(age: Int){
    filter { it.age < age }.forEach(::println)
}


//采用中缀表达式简化
infix fun List<Girl>.查找年龄小于16的(age: Int){
    filter { it.age < age }.forEach(::println)
}

fun filterByAddress(address:String){

    var 筛选的选手 = ArrayList<Girl>()
    for(girl in 选手数据库){
        if(girl.address == address){
            筛选的选手.add(girl)
        }
    }

    for(girl in 筛选的选手){
        println("${girl.address} ${girl.age}  ${girl.name}")
    }
}


fun filterByAge(age:Int){

    var 筛选的选手 = ArrayList<Girl>()
    for(girl in 选手数据库){
        if(girl.age <= age){
            筛选的选手.add(girl)
        }
    }

    for(girl in 筛选的选手){
        println("${girl.address} ${girl.age}  ${girl.name}")
    }
}


fun filterByAddressAgeHeight(address:String,age:Int,height: Int){

    var 筛选的选手 = ArrayList<Girl>()
    for(girl in 选手数据库){
        if( (girl.age <= age) and (girl.address==address) and (girl.height>=height)){
            筛选的选手.add(girl)
        }
    }

    for(girl in 筛选的选手){
        println("${girl.address} ${girl.age}  ${girl.name}")
    }
}


fun filterByMutilFilters(address:String,age:Int,height: Int, flag:Boolean){

    //flag为true, 年龄小的, flag为false, 年龄大的

    var 筛选的选手 = ArrayList<Girl>()

    if(flag){
        for(girl in 选手数据库){
            if( (girl.age <= age) and (girl.address==address) and (girl.height>=height)){
                筛选的选手.add(girl)
            }
        }
    }else{
        for(girl in 选手数据库){
            if( (girl.age >= age) and (girl.address==address) and (girl.height>=height)){
                筛选的选手.add(girl)
            }
        }
    }


    for(girl in 筛选的选手){
        println("${girl.address} ${girl.age}  ${girl.name}")
    }
}























