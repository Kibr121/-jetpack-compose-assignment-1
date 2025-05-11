package andorid.example.jetpack_compose_assignment_1

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CourseCard(courses:CourseModel ){
    var expand by rememberSaveable { mutableStateOf(false) }

    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.fillMaxWidth().padding(10.dp)
        ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .animateContentSize()

            ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp).fillMaxWidth()
            ) {
                Text(
                    text = courses.title,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyLarge

                    )

                Icon(
                    imageVector = if (expand)Icons.Default.KeyboardArrowUp  else Icons.Default.ArrowDropDown,
                    contentDescription = "Icon to expand",
                    modifier = Modifier
                        .clickable {
                        expand = ! expand
                    }
                        .size(35.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
                ) {
                Text(text = "Course code:${courses.courseCode}",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(text = "Course Credit hour: ${courses.creditHours}")

            }
            if (expand){
                Text(text = courses.description,
                    style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}