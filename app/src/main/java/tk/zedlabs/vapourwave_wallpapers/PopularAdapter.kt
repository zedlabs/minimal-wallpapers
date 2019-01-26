package tk.zedlabs.vapourwave_wallpapers

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.GlideException
import java.net.URL


private val mStringsPopular = arrayOf<String>(


    "https://images4.alphacoders.com/754/754567.png",
    "https://i.pinimg.com/originals/98/09/ae/9809aee294a16549d98f79d3fb409e28.jpg",
    "https://images.8tracks.com/cover/i/012/134/972/vaporwave_aesthetic-987.jpg?rect=528,1,718,718&q=98&fm=jpg&fit=max&w=640&h=640",
    "https://i.redd.it/2as5mszzs3l11.png",
    "https://images4.alphacoders.com/754/754567.png",
    "https://i.pinimg.com/originals/98/09/ae/9809aee294a16549d98f79d3fb409e28.jpg",
    "https://images.8tracks.com/cover/i/012/134/972/vaporwave_aesthetic-987.jpg?rect=528,1,718,718&q=98&fm=jpg&fit=max&w=640&h=640",
    "https://i.redd.it/2as5mszzs3l11.png",
    "https://images4.alphacoders.com/754/754567.png",
    "https://i.pinimg.com/originals/98/09/ae/9809aee294a16549d98f79d3fb409e28.jpg",
    "https://images.8tracks.com/cover/i/012/134/972/vaporwave_aesthetic-987.jpg?rect=528,1,718,718&q=98&fm=jpg&fit=max&w=640&h=640",
    "https://i.redd.it/2as5mszzs3l11.png"

)


class PopularAdapter(private val mContext: Context) : BaseAdapter() {


    override fun getCount(): Int = mStringsPopular.size

    override fun getItem(position: Int): Any? = null

    override fun getItemId(position: Int): Long = 0L

    // create a new ImageView for each item referenced by the Adapter
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val imageView: ImageView
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = ImageView(mContext)
            //imageView.layoutParams = ViewGroup.LayoutParams(85, 85)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8, 8, 8, 8)
        } else {
            imageView = convertView as ImageView
        }

       // imageView.setImageResource(mThumbIds[position])
       // val url = mStrings[position]

        GlideApp
            .with(parent)
            .load(mStringsPopular[position])
            .centerCrop()
            //.override(100, 200)
            .placeholder(R.drawable.sample_3)
            .into(imageView)

        return imageView
    }
}

//

