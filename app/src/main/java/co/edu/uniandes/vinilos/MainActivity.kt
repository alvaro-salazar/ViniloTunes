package co.edu.uniandes.vinilos

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import co.edu.uniandes.vinilos.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    // Variables que se utilizan en toda la clase
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar (crear) la vista de la actividad
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar la barra de herramientas en la parte superior
        setSupportActionBar(binding.appBarMain.toolbar)

//        binding.appBarMain.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }

        // Obtener referencias a los elementos visuales definidos en XML
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView

        // Encontrar el controlador de navegación que gestiona la navegación entre fragmentos
        val navController = findNavController(R.id.nav_host_fragment_content_main)

        // Definir configuración de la barra de aplicaciones y el menú lateral
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_album, R.id.nav_gallery, R.id.nav_home, R.id.nav_slideshow
            ), drawerLayout
        )

        // Configurar la barra de herramientas para que se sincronice con el controlador de navegación
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Configurar el menú lateral para que se sincronice con el controlador de navegación
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflar el menú; esto agrega elementos a la barra de acciones (action bar) si está presente.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        // Configuración de navegación hacia arriba (flecha hacia atrás en la barra de aplicaciones)
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}