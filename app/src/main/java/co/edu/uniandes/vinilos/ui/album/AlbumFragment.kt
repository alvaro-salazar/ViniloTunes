package co.edu.uniandes.vinilos.ui.album

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.edu.uniandes.vinilos.R

/**
 * Clase que representa el Fragmento de Album.
 * Esta clase es la encargada de manejar la vista de álbumes.
 * @return Devuelve una vista de álbum.
 */
class AlbumFragment : Fragment() {
    /**
     * Método estático que se utiliza para crear una nueva instancia de la clase AlbumFragment.
     */
    companion object {
        fun newInstance() = AlbumFragment()
    }

    // Crea una instancia del ViewModel AlbumViewModel. Se utiliza el ViewModelProvider.
    private lateinit var viewModel: AlbumViewModel

    /**
     * Método que se llama cuando el fragmento ha creado su vista.
     * @param inflater El LayoutInflater que se puede utilizar para inflar cualquier vista.
     * @param container Si no es nulo, este es el padre al que se deben adjuntar las vistas.
     * @param savedInstanceState Si no es nulo, este fragmento se está reconstruyendo a partir de
     * un estado guardado anterior como se indica aquí.
     * @return Devuelve la vista raíz del fragmento, es decir, la vista raíz de la jerarquía de
     * vistas del fragmento.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el diseño de la vista del fragmento desde el archivo fragment_album.xml
        // y lo asigna como la vista de este fragmento.
        return inflater.inflate(R.layout.fragment_album, container, false)
    }

    /**
     * Método que se llama cuando la actividad asociada a este fragmento ha completado su
     * creación y las vistas se han inicializado.
     * @param savedInstanceState Objeto Bundle que contiene el estado previamente congelado
     * de la actividad (si la hubo).
     * @return Un objeto View que es la raíz del layout del fragmento.
     */
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // Crea una instancia del ViewModel AlbumViewModel utilizando el ViewModelProvider.
        viewModel = ViewModelProvider(this).get(AlbumViewModel::class.java)
        // TODO: Use the ViewModel

        // En esta sección, se pueden realizar acciones adicionales relacionadas con la
        // inicialización del fragmento o interactuar con el ViewModel.
        // Por ejemplo, se pueden configurar vistas y asignar datos.
    }

}