package castillo.manuel.examen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CourseScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text("Examen", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text("Programacion para dispositivos moviles", color = Color.Gray, fontSize = 14.sp)
            }
            Text("7 semestre", color = Color.Gray, fontSize = 14.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFB6EFA2))
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    Text("Primer examen 2025B", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    Text("Hola Manuel!", color = Color.White, fontSize = 14.sp)
                    Button(
                        onClick = {},
                        modifier = Modifier.padding(top = 8.dp)
                    ) {
                        Text("Inicio")
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.dragon),
                    contentDescription = "Dragón verde",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Fit
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text("Courses", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))

        CourseItem(
            title = "Sitios web",
            date = "Comienza el 1 de agosto",
            price = "$199.80",
            imageRes = R.drawable.golem
        )
        CourseItem(
            title = "Programacion",
            date = "Comienza el 1 de septiembre",
            price = "$735.22",
            imageRes = R.drawable.robot
        )
    }
}

@Composable
fun CourseItem(title: String, date: String, price: String, imageRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color(0xFFEAF6FF), RoundedCornerShape(12.dp))
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(title, fontWeight = FontWeight.Bold)
            Text(date, color = Color.Gray, fontSize = 13.sp)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(price, color = Color.Gray, fontWeight = FontWeight.Medium)
        }
    }
}
