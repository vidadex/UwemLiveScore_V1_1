/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.uwemlivesore;
/**
 * {@link Uwemlivescore} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class Uwemlivescore {

    /**
     * Magnitude of the earthquake
     */
    private String mLeaguename;

    // Location of the earthquake
    private String mtime;

    // Location of the earthquake
    private String mhomename;


    // Location of the earthquake
    private String mScore;

    // Date of the earthquake
    private String mawayname;


    /**
     * Constructs a new {@link Uwemlivescore} object.
     *
     * @param leaguename is the magnitude (size) of the earthquake
     * @param time       is the location where the earthquake happened
     * @param homename   is the time in milliseconds (from the Epoch) when the
     *                   earthquake happened
     */
    public Uwemlivescore(String leaguename, String time, String homename, String score, String awayname) {
        mLeaguename = leaguename;
        mtime = time;
        mhomename = homename;
        mScore = score;
        mawayname = awayname;

    }

    /**
     * Get the Magnitude
     */
    public String getLeaguename() {
        return mLeaguename;
    }

    /**
     * Get the Location
     */
    public String getTime() {
        return mtime;
    }

    /**
     * Get the Location
     */
    public String getHomename() {
        return mhomename;
    }


    /**
     * Get the Location
     */
    public String getScores() {
        return mScore;
    }

    /**
     * Get the date
     */
    public String getAwayname() {
        return mawayname;
    }

}