package main.scala

object prob29 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
   val a = (for(a <- (2 to 100); b <- (2 to 100)) yield List(BigInt(a).pow(b),BigInt(b).pow(a)))
   						.flatten toSet
                                                  //> a  : scala.collection.immutable.Set[scala.math.BigInt] = Set(645767760190718
                                                  //| 297889184705014020888804383290681, 38597020613139683778789415094518564417309
                                                  //| 726968345976518387695616, 5308416, 92613871309978767095993579802451396670177
                                                  //| 2293499227988263405269197039529170894882252068039219702299428401, 1807613889
                                                  //| 5247646903989667028333041229872048118070715909518674070097184819809243056899
                                                  //| 1100144051654154871034424674642887717622081, 1488619150636303939379155658655
                                                  //| 9754231987119653801368686576988209222433278539331352152390143277346804233476
                                                  //| 592179447310859520222529876001, 41096312214751988571806672315568920976414711
                                                  //| 6520545174410510008329199685768993065402368, 2218808045961558224839162204204
                                                  //| 43821810533948253748281037527829169937762144877, 207167214753960286494995178
                                                  //| 7928109734464218816214042817591689527034759521484375, 1360762087452658811859
                                                  //| 319286800521461075186380185186862945556640625, 48519278097689642681155855396
                                                  //| 759336072749841943521979
                                                  //| Output exceeds cutoff limit.
   						
   println(a.size)                                //> 9183
}