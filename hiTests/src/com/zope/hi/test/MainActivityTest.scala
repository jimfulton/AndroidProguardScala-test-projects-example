package com.zope.hi.test

import android.test.ActivityInstrumentationTestCase2
import com.zope.hi.MainActivity
//import com.jayway.android.robotium.solo.Solo

class MainActivityTest
    extends ActivityInstrumentationTestCase2[MainActivity](
  "com.zope.zebrareach", classOf[MainActivity]) {

  def testSomething() {
      val x = 1
  }

}
