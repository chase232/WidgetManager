<%@ include file="/WEB-INF/layouts/include.jsp"%>
<div>
	<div class="oreillyGreen">
		<c:choose>
			<c:when test="${mode eq 'tableMode'}">
				<h1 class="oreillyGreen">Widget Manager</h1>
			</c:when>
			<c:when test="${mode eq 'addMode'}">
				<h1 class="oreillyGreen">Add Widget</h1>
			</c:when>
			<c:when test="${mode eq 'editMode'}">
				<h1 class="oreillyGreen">Edit Widget</h1>
			</c:when>
		</c:choose>
	</div>
	<div id="widgetMessage"></div>
	<div class="row">
		<div class="col-sm-12">
			<%-- TABLE MODE --%>
			<c:if test="${mode eq 'tableMode' }">
				<div id="tableMode" class="table-responsive">
					<table class="table table-striped table-bordered table-hover">
						<caption>Current Inventory</caption>
						<thead>
							<tr>
								<th>Action</th>
								<th>
									Soda ID
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-up"></span>
									</a>
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-down"></span>
									</a>
								</th>
								<th>
									Name
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-up"></span>
									</a>
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-down"></span>
									</a>
								</th>
								<th>
									Color
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-up"></span>
									</a>
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-down"></span>
									</a>
								</th>
								<th>
									Brand
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-up"></span>
									</a>
									&nbsp;
									<a href="#">
										<span class="glyphicon glyphicon-arrow-down"></span>
									</a>
								</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${sodaList}" var="entry">
							<tr>
								<td>
									<a href="<c:url value='/widgets/edit' />">
										<span class="glyphicon glyphicon-pencil oreillyGreen"></span>&nbsp;
									</a>
									<a href="<c:url value='/widgets/delete' />">
										<span class="glyphicon glyphicon-remove red"></span>
									</a>
								</td>
								<td>
									<c:out value="${entry.id}"/>
								</td>
								<td>
									<c:out value="${entry.name}"/>
								</td>
								<td>
									<c:out value="${entry.color}"/>
								</td>
								<td>
									<c:out value="${entry.brand}"/>
								</td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</c:if>

			<%-- ADD/EDIT MODE --%>
			<c:if test="${mode eq 'addMode' or mode eq 'editMode'}">
				add edit form goes here
				<form method = "post" action="<c:url value='/widgets/add' />">
					
					<label for="name">Name</label>
						<input type="text" id="name" name="name" value="${widget.name}" />&nbsp;
					<br/>
					<label for="color">Color</label>
						<input type="text" id="color" name="color" value="${widget.color}" />
					<br/>
					<label for="brand">Brand</label>
						<input type="text" id="brand" name="brand" value="${widget.brand}" />
					<br/>
					<button class="btn btn-primary" type="submit">Submit</button>
				</form>
			</c:if>
			
		</div>
	</div>
</div>
<script>
/* require([
	'dijit/registry', 'dojo/request', 'dojo/ready' 
], function (registry, request, ready) {
	var alertManager;
	ready(function () {
		let alertManager = registry.byId('alertManager');

		
		// If you choose to use AJAX to get a widget for editing, here is a template:
		registry.byId('?').on('click', function (e) {
			e.preventDefault(); // Prevent Form From Submitting "normally"
			var btn = this,
			
 			request('<c:url value="/some/url" />', {
				method: 'POST',
				handleAs: "json",
				data: {
					'value1': null,
					'value2': null
				}
			}).then(function(data) {
				var msg;
				btn.stopSpinner();
				console.log(data);
				//alertManager.addSuccess({message: "Email Sent Successfully!", position: 'widgetMessage'});
				//alertManager.addError({message: "Email Sent Successfully!", position: 'widgetMessage'});
			}, function(err) {
				btn.stopSpinner();
			    alertManager.addError({message: err, position: 'carPartMessage'});
			}); 
		}); // end registry by id
		
	});  // end ready function
});  // end require function */
</script>


