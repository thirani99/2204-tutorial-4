object main extends App {

  print("Enter number: ")
  var num =scala.io.StdIn.readInt();

  pat(num)


def pat(number:Int) = number match{
  case x if x <= 0 => println("Negative/Zero is input")
  case x if x %2 == 0 => println("Even number is given")
  case x if x %2 != 0 => println("Odd number is given")
}

}
