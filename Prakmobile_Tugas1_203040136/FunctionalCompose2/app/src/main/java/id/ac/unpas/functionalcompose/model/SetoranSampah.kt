package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class SetoranSampah(
    @PrimaryKey val id: String,
    val tanggalpinjam: String,
    val nama: String,
    val judulbuku: String,
    val harga: String
)
