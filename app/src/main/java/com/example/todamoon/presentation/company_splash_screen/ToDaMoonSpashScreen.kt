package com.example.todamoon.presentation.company_splash_screen

import android.util.Log
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todamoon.R
import com.example.todamoon.presentation.destinations.CompanyListingsScreenDestination

import com.example.todamoon.ui.theme.bgColorEdge
import com.example.todamoon.ui.theme.darkerOrange
import com.example.todamoon.ui.theme.mediumRed
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay

@Destination(start = true)
@Composable
fun ToDaMoonSplashScreen(navigator: DestinationsNavigator) {
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .background(bgColorEdge),
        contentAlignment = Alignment.Center
    ) {
        LaunchedEffect(key1 = true) {
            delay(2800L)
            navigator.navigate(CompanyListingsScreenDestination)
        }
        Rocket(maxWidth = maxWidth , maxHeight = maxHeight, rocketSize = 100.dp)
Log.d("TAG", "current maxWidth: $maxWidth")





        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Surface(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(200.dp),

                shape = CircleShape,
                color = Color.Transparent,

                border = BorderStroke(width = 3.dp, color = darkerOrange)
            ) {
                Column(
                    modifier = Modifier
                        .padding(1.dp),
                    horizontalAlignment = CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.wsb),
                        contentDescription = "Logo",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.size(195.dp)
                    )


                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "To Da Moon",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = darkerOrange
            )
        }

    }
}


@Composable
fun Rocket(
    maxWidth: Dp,
    maxHeight: Dp,
    rocketSize: Dp,

) {


    val modifier: Modifier
    val infiniteTransition = rememberInfiniteTransition()
    val posistionState =
       infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 3500,
                easing = LinearEasing
            )
        )
    )
    modifier = Modifier.offset(
        x = (maxWidth - 100.dp) * posistionState.value,
        y = (maxHeight - 800.dp) - (maxHeight - rocketSize) * posistionState.value
    )
    Image(
        painter = painterResource(id = R.drawable.rocketwsb),
        contentDescription = "test",
        modifier = modifier
            .height(rocketSize)
            .width(rocketSize)
    )


}


