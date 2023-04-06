fun main(){
    //immutable list(can't add or remove objects)
val fruits = listOf("Apple", "Banana","Code","Mango")
    println(fruits)

    //mutable list(can add or remove objects in the list)
    val Rwanda = mutableListOf("kagame",12500,66.7,"RWF",false)
    println(Rwanda)

    //fruits.add("Avocado")
    Rwanda.add("EAC")
    Rwanda.remove(66.7)
    println(Rwanda)

    val nums = listOf(21,43,321,332,43,2,111,4,5)
    println(nums.count())
    println(nums.max())
    println(nums.min())
    println(nums.average())
    println(nums.first())
    println(nums.last())
    println(nums[5])
    println(nums.get(5))
    println(nums.indexOf(322))
    println(nums.indexOf(34))
    println(nums.lastIndexOf(43))//access a character if they are more than one in a list
    println(nums.lastIndex)
    val x = nums.sorted()
    //nums.sorted()
    println(x)
    println(nums is List<Int>)

    //filtering a list
    val evenList = mutableListOf<Int>()
    for(i in nums){
        if(i%2 ==0){
            evenList.add(i)
        }
    }
    println(evenList)

    val even = nums.filter {g->g%2 ==0}
    println(even)

    val geisha = Product("Geisha",50.0)

    println(geisha is Product)
    createProductList()

integers()
//    val ints = listOf(2,4,6,8,1,4)
}

data class Product(var name:String,var price:Double)

fun createProductList(){
    val kiwi = Product("kiwi shoe polish",80.0)
    val prod2 = Product("Colgate",60.0)
    val ilara = Product("Ilara milk",30.0)
    val bread = Product("sunblest",65.0)
    val biscuit = Product("nuvita",5.0)

    val product = listOf(kiwi,prod2,ilara,bread,biscuit)
    println(product)
    val sortedProducts = product.sortedByDescending{z ->z.name}
   println(sortedProducts)
    //return product


    //filtering a list of objects.
    val itemsIcanafford = product.filter{product->product.price <=50}
    println(itemsIcanafford)

}


//write a function that takes in a list of integers
//and prints out the square of each element

fun integers(){
    val ints = listOf(2,4,6,8,1,4)
    for(i in ints){
        println(i*i)
    }
   // ints.forEach{x-> print(x*x)}
}