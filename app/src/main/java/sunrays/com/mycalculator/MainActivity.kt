package sunrays.com.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    var a:String=""
    var b:String=""
    var res:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd.setOnClickListener{
            a=edtnum1.text.toString()
            b=edtnum2.text.toString()
            var a1=a.toInt()
            var b1=b.toInt()
            var sum=a1+b1
            txtresult.setText(sum.toString())
        }
        btnmul.setOnClickListener(){
            var a2=a.toInt()
            var b2=b.toInt()
            var mul=a2*b2
            txtresult.setText(mul.toString())
        }
        btnsub.setOnClickListener(){
            var a3=a.toInt()
            var b3=b.toInt()
            var sub =a3 - b3
            txtresult.setText(sub.toString())
        }
        btndiv.setOnClickListener(){
            var a4=a.toInt()
            var b4=b.toInt()
            var div:Int=0
            div=a4/b4
            txtresult.setText(div.toString())
        }
        }
}
