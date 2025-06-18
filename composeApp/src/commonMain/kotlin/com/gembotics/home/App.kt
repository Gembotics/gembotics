package com.gembotics.home

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    MaterialTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
                    .padding(innerPadding)
            ) {
                WebsiteContent()
            }
        }
    }
}

@Composable
fun WebsiteContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
    ) {
        Header()
        Navigation()
        MainContent()
        Spacer(modifier = Modifier.weight(1f))
        ServicesSection()
        Footer()
    }
}

@Composable
fun Header() {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Gembotics",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )

            // Add logo here
        }
    }
}

@Composable
fun Navigation() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        NavItem("Home")
        NavItem("Services")
        NavItem("Projects")
        NavItem("About")
        NavItem("Contact")
    }
}

@Composable
fun NavItem(text: String) {
    TextButton(onClick = {}) {
        Text(text)
    }
}

@Composable
fun MainContent() {
    Column(modifier = Modifier.padding(16.dp)) {
        HeroSection()
        ProjectsSection()
    }
}

@Composable
fun HeroSection() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Innovation Through Technology",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            "Pioneering Solutions in IoT, AI, and Blockchain Privacy",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun ServicesSection() {
    Column {
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = "Our Services",
            style = MaterialTheme.typography.headlineMedium
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ServiceCard("IoT Solutions", "Connected devices and smart systems")
            ServiceCard("AI & Machine Learning", "Intelligent automation and data analysis")
            ServiceCard("Bitcoin Privacy", "Secure and private cryptocurrency solutions")
        }
    }
}

@Composable
fun ServiceCard(title: String, description: String) {
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                title,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                description,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
fun ProjectsSection() {
    // Add your projects showcase here
}

@Composable
fun Footer() {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    "Gembotics",
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Text(
                    "© 2025 All rights reserved",
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }

            Row {
                // Add social media links here
            }
        }
    }
}