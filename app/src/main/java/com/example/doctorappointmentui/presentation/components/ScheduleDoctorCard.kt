package com.example.doctorappointmentui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doctorappointmentui.R
import com.example.doctorappointmentui.ui.theme.BluePrimary
import com.example.doctorappointmentui.ui.theme.PurpleGrey
import com.example.doctorappointmentui.ui.theme.TextColorTitle
import com.example.doctorappointmentui.ui.theme.poppinsFontFamily

@Composable
fun ScheduleDoctorCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = Color.White,
        tonalElevation = 0.2.dp,
        shadowElevation = 0.2.dp,
    ) {
        Column(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 20.dp)
        ) {
            Image(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.img_doctor_1),
                contentDescription = "ImageDoctor1"
            )
            Column(
                modifier = Modifier
                    .padding(start = 12.dp),

                ) {
                Text(
                    text = "Dr. Ibnu Sina",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = TextColorTitle
                )
                Text(
                    text = "General Doctor",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Light,
                    color = PurpleGrey
                )
            }

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(1.dp)
                    .alpha(0.1f),
                color = Color.Gray
            )
            ScheduleTimeContent(contentColor = PurpleGrey)

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                colors = ButtonDefaults.buttonColors(contentColor = Color(0xFF63B4FF).copy(alpha = 0.1f)),
                onClick = { /*TODO*/ }
            ) {
                Text(
                    text = "Detail",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = BluePrimary
                )
            }
        }

    }
}


@Preview
@Composable
private fun ScheduleDoctorCardPreview() {
    ScheduleDoctorCard()
}