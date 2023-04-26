package dev.rayh.composeactivity.cartoes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.rayh.composeactivity.R
import dev.rayh.composeactivity.cartoes.ui.theme.ComposeActivityTheme

class CartaoDeVisita : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun perfilBox(fullName: String, title: String, modifier: Modifier = Modifier){
    Box(modifier){
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val imagem = painterResource(id = R.drawable.eu)
            Image(
                painter = imagem,
                contentDescription = null,

            )
            Text(
                text = fullName
            )
            Text(
                text = title
            )
        }
    }
}

@Composable
fun contatoBox(email: String, instagram: String, celular: String, modifier: Modifier = Modifier){
    Box(modifier = modifier ){
        Column() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(id = R.drawable.phone_call)
                Image( painter = image, contentDescription = null)
                Text(
                    text = celular
                )
            }
            Row (
                verticalAlignment = Alignment.CenterVertically
                    ){
                val image = painterResource(id = R.drawable.instagram)
                Image(painter = image , contentDescription = null)
                Text(
                    text = instagram 
                )
            }
            Row (
                verticalAlignment = Alignment.CenterVertically
                    ){
                val image = painterResource(id = R.drawable.gmail)
                Image( image, null)
                Text(
                    email,
                    color = Color.Black
                )
            }
        }
    }
}

@Composable
fun parent(fullName: String, title: String, email: String, instagram: String, celular: String, modifier: Modifier = Modifier){
    Box(
        Modifier.fillMaxSize()
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            perfilBox(fullName = fullName, title = title)
            contatoBox(email = email, instagram = instagram, celular = celular)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeActivityTheme {
        parent(
            fullName = "Rayh",
            title = "Ditador",
            email = "raykah.silva@gmail.com",
            instagram = "im_rayh",
            celular = "(62)9 9461-3585"
        )
    }
}