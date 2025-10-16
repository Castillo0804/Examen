package castillo.manuel.examen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DualScreen() {
    Row(modifier = Modifier.fillMaxSize()) {
        // Pantalla de cursos con scroll independiente
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {
            CourseScreen()
        }

        // Divider entre pantallas
        Divider(
            modifier = Modifier
                .width(1.dp)
                .fillMaxHeight()
        )

        // Pantalla de perfil con scroll independiente
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {
            ProfileScreen()
        }
    }
}
