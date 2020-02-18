package com.deathrow.testappjetpack

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Splash()
            }
        }
    }
}

@Composable
fun Splash() {
    val image = imageResource(R.drawable.i_stock_580115846)
    Column(modifier = LayoutPadding(0.dp)) {

        Container(modifier = LayoutFlexible(3f)) {
            SimpleImage(image = image)
        }


            Container(modifier = LayoutFlexible(1f)){

                Align(alignment = Alignment.Center) {

                    Column() {
                        Row() {
                            Text(text = "Wolenje, Lipa kwa urahisi")

                        }
                        Row(){

                            Padding(padding = 32.dp) {
                                Button(text = "GET STARTED")
                            }

                        }

                    }


                }
                 }

         }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {

            Splash()

    }
}