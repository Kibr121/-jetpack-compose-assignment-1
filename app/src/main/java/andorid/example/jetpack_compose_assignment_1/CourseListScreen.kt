package andorid.example.jetpack_compose_assignment_1

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CourseListScreen(courses: List<CourseModel>, innerPadding: PaddingValues){

    LazyColumn(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
        item { Text("Academic Courses", fontSize = 23.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(16.dp)) }
        items(courses){course->
            CourseCard(courses = course)
        }

    }
}