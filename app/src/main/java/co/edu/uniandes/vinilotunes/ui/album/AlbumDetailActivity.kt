package co.edu.uniandes.vinilotunes.ui.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import co.edu.uniandes.vinilotunes.R
import co.edu.uniandes.vinilotunes.databinding.ActivityAlbumDetailBinding

class AlbumDetailActivity : AppCompatActivity() {

    private var idAlbum: Int = 0
    private val albumViewModel: AlbumViewModel by viewModels()
    private lateinit var binding: ActivityAlbumDetailBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_album_detail)

        // Se obtiene una referencia al ActionBar (Barra de herramientas).
        val actionBar = supportActionBar
        // Se habilita el botón de retroceso.
        actionBar?.setDisplayHomeAsUpEnabled(true)

        idAlbum = intent.getIntExtra("ID_ALBUM", 0)
        // Observa el LiveData para recibir datos del ViewModel
        albumViewModel.album.observe(this) { album ->
            if (album != null) {
                binding.album = album
            }
        }
    }

    override fun onResume() {
        super.onResume()
        albumViewModel.getAlbumById(idAlbum)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                // Maneja el evento del botón de retroceso aquí.
                finish() // Cierra la actividad actual y regresa a la lista de álbumes.
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}