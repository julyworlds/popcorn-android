/*
 * This file is part of Popcorn Time.
 *
 * Popcorn Time is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Popcorn Time is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Popcorn Time. If not, see <http://www.gnu.org/licenses/>.
 */

package pct.droid.tv.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import pct.droid.tv.R;
import pct.droid.tv.activities.base.PTVBaseActivity;


public class PTVSearchActivity extends PTVBaseActivity {

	public static Intent startActivity(Activity activity) {
		Intent intent = new Intent(activity, PTVSearchActivity.class);
		activity.startActivity(intent);
		return intent;
	}

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState,R.layout.activity_search);
	}
}
