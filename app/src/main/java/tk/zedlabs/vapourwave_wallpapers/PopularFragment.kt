package tk.zedlabs.vapourwave_wallpapers

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast


class PopularFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_papers, container, false)

        val gridView: GridView = rootView.findViewById(R.id.papers_gridview)

        gridView.adapter = PopularAdapter(this.requireContext())

        gridView.onItemClickListener =
                OnItemClickListener { parent, v, position, id ->
                    Toast.makeText(activity, "$position", Toast.LENGTH_SHORT).show()
                }
        return rootView
    }


}
