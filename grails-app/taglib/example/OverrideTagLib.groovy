package example

import org.grails.plugins.web.taglib.FormTagLib
import org.springframework.beans.factory.annotation.Autowired

class OverrideTagLib {

	@Autowired
	FormTagLib formTagLib
	
	def form = { attrs, body ->
		out << formTagLib.form(attrs, body)
	}
	
}
