package java.com.viewpager2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pageNames = listOf<String>(
            "page1",
            "page2",
            "page3"
        )
        val adapter = ViewPagerAdapter(pageNames)

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.text = "Tab ${position +1}"
        }.attach()

    }
}