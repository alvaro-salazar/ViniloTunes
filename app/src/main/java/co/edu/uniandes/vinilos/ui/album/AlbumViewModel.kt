package co.edu.uniandes.vinilos.ui.album

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Clase que representa el ViewModel de la vista de álbumes.
 * Esta clase es la encargada de manejar los datos que se muestran en la vista de álbumes.
 */
class AlbumViewModel : ViewModel() {

    // Creamos una variable privada llamada "_text" para almacenar datos de tipo String.
    // Utilizamos MutableLiveData para poder cambiar su valor dinámicamente.
    private val _text = MutableLiveData<String>().apply {
        // Establecemos un valor inicial para "_text" en "This is album Fragment".
        value = "This is album Fragment"
    }

    // Creamos una variable pública llamada "text" que almacena datos de tipo LiveData<String>.
    // LiveData es una clase que se utiliza para notificar a las vistas cuando los datos cambian.
    val text: LiveData<String> = _text
}