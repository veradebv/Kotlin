package com.example.top10downloader

import android.util.Log
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory

class ParseApplications {
    private val TAG = "ParseApplications"
    val applications = ArrayList<FeedEntry>()


    fun parse(xmlData: String): Boolean {
        Log.d(TAG, "parse called with $xmlData")
        var status = true
        var inEntry = false
        var textValue = ""

        try {
            val factory = XmlPullParserFactory.newInstance()
            factory.isNamespaceAware = true
            val xpp = factory.newPullParser()
            // 19-21 responsible for java xml parser

            xpp.setInput(xmlData.reader())
            // 24 we have a valid PullParser object, so we can tell it what to parse by giving it a StringReader, that's using the xmlData String.
            //Now a StringReader, by the way, is a class that treats a String like a stream. So think of it as an efficient way of processing
            //strings, and the way that the XMLPull Parser does things. Now you probably saw it pop up that it wanted a Reader when I
            //typed the opening bracket after set  Input. So the XMLPullParser needs a StringReader to read from,
            //and a String Reader needs a String to read - which is what we've got on line 25 there. Kotlin makes that a lot easier.
            //It provides an extension function that returns a String Reader for us, already set to read from our xmlData string. 
            var eventType = xpp.eventType
            var currentRecord = FeedEntry()
            while (eventType != XmlPullParser.END_DOCUMENT) {

            }

        } catch (e: Exception) {
            e.printStackTrace()
            status = false
        }

        return status
    }
}