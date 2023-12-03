package com.softwareit.bottom_sheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.softwareit.bottom_sheet.databinding.FragmentStationBottomSheetBinding
import com.softwareit.bottom_sheet.model.Station

class StationBottomSheetFragment(
    private val station: Station,
    private val onOpenInGoogleMapClick: (Station) -> Unit = {},
) : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentStationBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentStationBottomSheetBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            stationImageView.setImageResource(station.image)
            name.text = station.name
            city.text = station.city
            location.text = station.location

            availablePorts.text = getString(R.string.available_port_count, station.availablePorts)
            if (station.id == 2) availablePorts.setTextColor(
                ContextCompat.getColor(requireContext(), R.color.yellow)
            )

            openInGoogleMapsButton.setOnClickListener {
                onOpenInGoogleMapClick(station)
                dismiss()
            }

        }
    }
}