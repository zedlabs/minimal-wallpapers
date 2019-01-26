package tk.zedlabs.vapourwave_wallpapers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import kotlinx.android.synthetic.main.app_bar.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<androidx.viewpager.widget.ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val adapter = TabAdapter(supportFragmentManager)

        adapter.addFragment(PopularFragment(), "Popular")
        adapter.addFragment(NewFragment(), "New")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

        val item1 = PrimaryDrawerItem().withIdentifier(9).withName(R.string.drawer_item_welcome)
        val item2 = SecondaryDrawerItem().withIdentifier(0).withName(R.string.drawer_item_popular)
        val item3 = SecondaryDrawerItem().withIdentifier(98).withName(R.string.drawer_item_new)

//create the drawer and remember the `Drawer` result object
        val result = DrawerBuilder()
            .withActivity(this)
            .withToolbar(toolbar)
            .addDrawerItems(
                item1,
                DividerDrawerItem(),
                item2,
                item3
            )
            .withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(view: View, position: Int, drawerItem: IDrawerItem<*, *>): Boolean {
                    viewPager.currentItem = drawerItem.identifier.toInt()
                    return false
                }
            })
            .build()

    }
}
