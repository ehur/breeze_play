import breeze.linalg._
import java.io.File
val x = DenseVector.zeros[Double](5)
x.length
x(1)=2
x(3 to 4) := .5
x(0 to 1) := DenseVector(.1,.2)
x
val m = DenseMatrix.zeros[Int](5,5)
val rs=m.rows
val cs=m.cols
//The columns of m can be accessed as DenseVectors, and the rows as DenseMatrices.
val firstCol=m(::,1)
val thirdRow = m(3,::)
m(4,::) := DenseVector(1,2,3,4,5).t
m(0 to 1, 0 to 1) := DenseMatrix((3,1),(-1,-2))
m
val onesMatrix = DenseMatrix.ones[Int](5,5)
val threesMatrix = onesMatrix + 2
val twosM = DenseMatrix.ones[Int](2,5) + 1
twosM * threesMatrix
val theta = DenseVector(5,5,5,5,5)
val hyp = theta.t * threesMatrix
val hypError:DenseVector[Int] = hyp.t - DenseVector(2,2,2,2,2)
DenseVector(1,1,1,1) dot DenseVector(5,6,7,8)
DenseVector(5,6,7,8) :* DenseVector(5,6,7,8)
val newby:DenseMatrix[Int] = new DenseMatrix(2, 3, Array(11, 12, 13, 21, 22, 23))
val fileby: DenseMatrix[Double] = csvread(new File("/home/lhurley/git/breeze_play/tester.txt"))
val X_new = DenseMatrix.horzcat( DenseMatrix.ones[Int](threesMatrix.rows,1),threesMatrix)
val fC = fileby(::,0)
fileby.rows
fC.toDenseMatrix.t.rows
val onesM = DenseMatrix.ones[Double](fileby.rows,1)
val xCol:DenseMatrix[Double] = fC.toDenseMatrix.t
val xMatrix = DenseMatrix.horzcat(onesM,xCol)
val theta_ = DenseMatrix.zeros[Double](1,2)
val mult = theta_ * xMatrix.t
val y= new DenseMatrix[Double](1,2,Array(3.0,4.0))
val yy = DenseVector[Double](3.0,4.0)
yy.toDenseMatrix
val mins = theta_ - y

