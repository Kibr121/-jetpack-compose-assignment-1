package andorid.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import andorid.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme
import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpackcomposeassignment1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CourseListScreen(sampleCourses, innerPadding)
                }
            }
        }
    }
}

@Preview(showBackground = true )
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewCourseListScreen() {
    Jetpackcomposeassignment1Theme {
        CourseListScreen(
            courses = sampleCourses,
            innerPadding = PaddingValues(0.dp) // dummy padding for preview
        )
    }
}

