package com.example.k2022_03_08_rv.model

import kotlin.collections.MutableList

var stations: MutableList<RadioStation> = mutableListOf(RadioStation("name", "http://stream.whus.org:8000/whusfm"))


class RadioStations() {

    init {
        stations.add(RadioStation("Wisconsin public radio  ", "https://wpr-ice.streamguys1.com/wpr-music-mp3-96"))
        stations.add(RadioStation("Maine NPR  ", "https://playerservices.streamtheworld.com/api/livestream-redirect/WMEAFM.mp3"))
        stations.add(RadioStation("BBC Radio 1", "http://bbcwssc.ic.llnwd.net/stream/bbcwssc_mp1_ws-eieuk"))
    }

    public fun getStations() : MutableList<RadioStation> {

        return stations
    }

    public fun size() : Int {
        return stations.size
    }
}

