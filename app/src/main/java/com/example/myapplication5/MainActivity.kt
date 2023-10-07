package com.example.myapplication5
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication5.ui.theme.MyApplication5Theme
import com.example.myapplication5.components.BotonIcono
import com.example.myapplication5.components.BotonNormal
import com.example.myapplication5.components.BotonNormal2
import com.example.myapplication5.components.BotonOutline
import com.example.myapplication5.components.BotonSwitch
import com.example.myapplication5.components.BotonTexto
import com.example.myapplication5.components.DarkMode
import com.example.myapplication5.components.FloatingAction
import com.example.myapplication5.components.Space
import com.example.myapplication5.ui.theme.MyApplication5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false) }

            MyApplication5Theme(darkTheme = darkMode.value){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Content(darkMode)
                }
            }
        }
    }
}
@Composable
fun Content(darkMode: MutableState<Boolean>){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()

        DarkMode(darkMode = darkMode)
        Space()
        FloatingAction()
    }
}