package tk.zedlabs.vapourwave_wallpapers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.design.widget.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

//    private var adapter: TabAdapter? = null
//    private var tabLayout: TabLayout? = null
//    private var viewPager: ViewPager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val adapter = TabAdapter(supportFragmentManager)

        adapter.addFragment(PopularFragment(), "Popular")
        adapter.addFragment(NewFragment(), "New")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

//        val popularFragment = PopularFragment()
//        val fragmentManager = supportFragmentManager
//        fragmentManager.beginTransaction()
//            .add(R.id.main_wallpaper_list, popularFragment)
//            .commit()


    }
}
