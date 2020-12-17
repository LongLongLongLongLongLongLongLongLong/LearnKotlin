fun main(args:Array<String>) {
//    filterByAddress("湖南");
//    filterByAge(17);
//    filterByAddressAgeHeight("湖南",17,165);
//    filterByMutilFilters("湖南",17,165,false)

//    println(选手数据库.maxBy { it.age });


//    println(选手数据库.filter { (it.age>16) and (it.address=="山东") });

    //取出集合中 以age和address组成的新的集合并返回
//    println(选手数据库.map { "${it.age}: ${it.address}" });
    //[18: 山东, 19: 广东, 16: 湖南, 17: 浙江, 17: 四川, 19: 山西, 18: 陕西, 15: 西藏, 19: 河北, 18: 甘肃]


    // any 返回Boolean 类型，查看数据中是否有符合条件的
//    println(选手数据库.any { it.age>16 });

    // count 返回个数，统计符合条件的数据
//    println(选手数据库.count { it.age>16 });

  // find 返回第一条符合条件的数据
//  println(选手数据库.find { it.age==16 });

//   println(选手数据库.groupBy { it.address });

//   选手数据库.groupBy { it.address }.get("山东")?.forEach { println(it) }


//   选手数据库.查找年龄小于17的(17) //扩展方法调用

   //调用中缀表达式的函数，中间有空格分隔就可以调用
   选手数据库 查找年龄小于16的 16






}