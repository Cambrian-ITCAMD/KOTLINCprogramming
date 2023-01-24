///jfjfjfjgj////

fun main()
{
    print("hello world\n")

    var myint = 5
    val mychar = 's'
    var myDouble : Double = 3.14

    println(myint)
    println(mychar)
    println(myDouble)


    var myNewInt : Int
    myNewInt = readln().toInt()
    println("the integer entered by the user is:"+ myNewInt)


    //if else is same
    var myBool = true
    if(myBool)
    {
        println("Must be heads")
    }
    else if(!myBool)
    {
        println("guess it's tails")
    }
    else
    {
        println("the coin is landed on its side")
    }


    //just like switch statements
    when(myNewInt %2)
    {
        0 -> {
            println("even")
        }
        1 ->{
            println("odd")
        }
        else ->{
            println("quantum")
        }
    }


    //for loop

    for(i in 1..10)
    {
        println(i)
    }

    //nested loop

    for(i in 0..9)
    {
        for(j in 0..9)
        {
            if(j==5)
            {
                break
            }
            println(i.toString()+"/"+j)
        }
    }

    //while loop

    var myCounter = 0
    while(myCounter < 10)
    {
        println("My counter:" + myCounter)
        ++myCounter
    }


    /*
    for assignment
    while(true)   // while(d1==d2 && d1==d3 &&.....d1==d5)
    {
        if(allDiceequal)
        {
            break
        }
    }
    */

 
    val Array = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    for(item in Array)
    {
       println(item) 
    }


    for(index in 0..Array.count()-1)
    {
        Array[index] *= 5
        println(Array[index])
    }


    var myList = listOf(1,2,3,45,67,88)
    for(item in myList)
    {
        println(item)
    }
}