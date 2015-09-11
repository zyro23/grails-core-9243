package example

class OverrideTagLib {

	static namespace = 'my'
	
	def form = { attrs, body ->
		out << g.form(attrs, body)
	}

}
