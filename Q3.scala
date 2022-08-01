object main extends App{

  println(formatName(name= "Benny")( idList = 0,1,2,3,4 )(upper(_))(lower(_)))
  println(formatName(name= "Niroshan")( idList = 0,1 )(upper(_))(lower(_)))
  println(formatName(name= "Saman")( idList = -1 )(upper(_))(lower(_)))
  println(formatName(name= "Kumara")( idList = 0,5 )(upper(_))(lower(_)))


def upper(name:String):String={
  return name.toUpperCase()
}

def lower(name:String):String={
  return name.toLowerCase()
}

def formatName(name:String)(idList:Int*)(function1:String=>String)(function2:String=>String):String={
    var num = name.length()
    var temp=""
    var i=0
    while(i<num){
      if(idList.contains(i)){
        temp=temp + function1(name.charAt(i).toString)
      }
      else{
        temp = temp + function2(name.charAt(i).toString)
      }
      i=i+1
    }
    return temp
}
}
