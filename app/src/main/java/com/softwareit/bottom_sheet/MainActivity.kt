package com.softwareit.bottom_sheet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.softwareit.bottom_sheet.data.LocalDataSource
import com.softwareit.bottom_sheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val stationList = LocalDataSource.stationList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            station1.setOnClickListener {
                showStationBottomSheetFragment(id = 1)
            }
            station2.setOnClickListener {
                showStationBottomSheetFragment(id = 2)
            }
            station3.setOnClickListener {
                showStationBottomSheetFragment(id = 3)
            }
        }
    }

    private fun showStationBottomSheetFragment(id: Int) {
        val stationBottomSheet = StationBottomSheetFragment(
            stationList.find { it.id == id } ?: error("unknown id")
        ) {
            Toast.makeText(this, "Open in Google Map Station #$id", Toast.LENGTH_SHORT).show()
        }
        stationBottomSheet.show(supportFragmentManager, stationBottomSheet.tag)
    }
}