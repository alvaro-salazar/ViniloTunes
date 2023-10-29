package co.edu.uniandes.vinilotunes.data.repository

import android.app.Application
import co.edu.uniandes.vinilotunes.data.model.Album
import co.edu.uniandes.vinilotunes.data.net.ApiService

/**
 * Esta clase es la encargada de manejar la comunicación con el servidor para obtener los datos de los álbumes.
 * @property application La aplicación que se está ejecutando.
 */
class AlbumRepository (val application: Application) {

    /**
     * Método que se encarga de obtener todos los álbumes desde el servidor.
     * @return La lista de álbumes.
     */
    suspend fun getAllAlbums(): List<Album> = ApiService.getAllAlbums()


}